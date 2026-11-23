# Android Starter

A minimal template for building an Android app with [Jetpack Compose](https://developer.android.com/compose). Ships pre-configured with formatting, linting, unit tests, pre-commit hooks, and CI.

## Getting Started

Create a new repository from this template on GitHub using [this link](https://github.com/new?template_name=android-starter&template_owner=threeal), or clone it locally and point it at your own remote.

## Setup

Install [SDKMAN!](https://sdkman.io/), then install the JDK pinned in `.sdkmanrc`:

```sh
sdk env install
```

Install the [Android SDK](https://developer.android.com/tools), either through Android Studio or its command-line tools, and point the `ANDROID_HOME` environment variable at it.

Install [Lefthook](https://lefthook.dev/) and [dprint](https://dprint.dev/), then register the pre-commit hook:

```sh
lefthook install
```

## Customizing

Replace or extend the template files to fit your project:

- **`app/src/`** — Replace the placeholder counter screen and tests with your own code.
- **`app/build.gradle.kts`** — Update the namespace, application ID, and version.
- **`CLAUDE.md`** — Replace with guidance specific to your project.
- **`LICENSE`** — Replace with your preferred license, or keep the [Unlicense](https://unlicense.org/).
- **`README.md`** — Replace with a description of your project.
- **`settings.gradle.kts`** — Rename the project.

## Development

Build the app and run the tests and checks through the Gradle wrapper:

```sh
./gradlew check assembleDebug
```

Try the app on a connected device or a running emulator with:

```sh
./gradlew installDebug
```

Dependencies are locked in `app/gradle.lockfile`, so regenerate it with `./gradlew :app:dependencies --write-locks` after changing them.

Each `git commit` runs the pre-commit hook registered during setup, which checks your changes and fixes what it can in place. If it fails, fix any reported issues, re-stage the changed files, and commit again.

After committing, push to `main` or open a pull request from another branch — CI will run the same checks across all files, plus additional checks of its own.
