package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, T_B]
case class CC_B(a: Boolean, b: T_B) extends T_A[T_B, T_B]
case class CC_C(a: T_A[Byte, CC_B], b: CC_A, c: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_D(a: T_A[T_B, T_B], b: CC_B, c: T_A[T_B, T_B]) extends T_B
case class CC_E(a: T_A[T_B, T_B], b: (CC_B,CC_D)) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), CC_B(_, CC_D(_, _, _)), CC_A()) => 0 
  case CC_D(CC_A(), CC_B(_, CC_E(_, _)), CC_A()) => 1 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_A()) => 2 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_E(_, _)), CC_A()) => 3 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_D(_, _, _)), CC_A()) => 4 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_E(_, _)), CC_A()) => 5 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_D(_, _, _)), CC_A()) => 6 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_E(_, _)), CC_A()) => 7 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_E(_, _)), CC_A()) => 8 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_A()) => 9 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_E(_, _)), CC_A()) => 10 
  case CC_D(CC_A(), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_D(_, _, _))) => 11 
  case CC_D(CC_A(), CC_B(_, CC_E(_, _)), CC_B(true, CC_D(_, _, _))) => 12 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_D(_, _, _))) => 13 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_E(_, _)), CC_B(true, CC_D(_, _, _))) => 14 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_D(_, _, _))) => 15 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_E(_, _)), CC_B(true, CC_D(_, _, _))) => 16 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_D(_, _, _))) => 17 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_E(_, _)), CC_B(true, CC_D(_, _, _))) => 18 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_D(_, _, _))) => 19 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_E(_, _)), CC_B(true, CC_D(_, _, _))) => 20 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_D(_, _, _))) => 21 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_E(_, _)), CC_B(true, CC_D(_, _, _))) => 22 
  case CC_D(CC_A(), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_D(_, _, _))) => 23 
  case CC_D(CC_A(), CC_B(_, CC_E(_, _)), CC_B(false, CC_D(_, _, _))) => 24 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_D(_, _, _))) => 25 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_E(_, _)), CC_B(false, CC_D(_, _, _))) => 26 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_D(_, _, _))) => 27 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_E(_, _)), CC_B(false, CC_D(_, _, _))) => 28 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_D(_, _, _))) => 29 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_E(_, _)), CC_B(false, CC_D(_, _, _))) => 30 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_D(_, _, _))) => 31 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_E(_, _)), CC_B(false, CC_D(_, _, _))) => 32 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_D(_, _, _))) => 33 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_E(_, _)), CC_B(false, CC_D(_, _, _))) => 34 
  case CC_D(CC_A(), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_E(_, _))) => 35 
  case CC_D(CC_A(), CC_B(_, CC_E(_, _)), CC_B(true, CC_E(_, _))) => 36 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_E(_, _))) => 37 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_E(_, _)), CC_B(true, CC_E(_, _))) => 38 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_E(_, _))) => 39 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_E(_, _)), CC_B(true, CC_E(_, _))) => 40 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_E(_, _))) => 41 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_E(_, _)), CC_B(true, CC_E(_, _))) => 42 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_E(_, _))) => 43 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_E(_, _)), CC_B(true, CC_E(_, _))) => 44 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_B(true, CC_E(_, _))) => 45 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_E(_, _)), CC_B(true, CC_E(_, _))) => 46 
  case CC_D(CC_A(), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_E(_, _))) => 47 
  case CC_D(CC_A(), CC_B(_, CC_E(_, _)), CC_B(false, CC_E(_, _))) => 48 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_E(_, _))) => 49 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_E(_, _)), CC_B(false, CC_E(_, _))) => 50 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_E(_, _))) => 51 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_E(_, _)), CC_B(false, CC_E(_, _))) => 52 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_E(_, _))) => 53 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_E(_, _)), CC_B(false, CC_E(_, _))) => 54 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_E(_, _))) => 55 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_E(_, _)), CC_B(false, CC_E(_, _))) => 56 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_B(false, CC_E(_, _))) => 57 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_E(_, _)), CC_B(false, CC_E(_, _))) => 58 
  case CC_D(CC_A(), CC_B(_, CC_D(_, _, _)), CC_C(_, CC_A(), _)) => 59 
  case CC_D(CC_A(), CC_B(_, CC_E(_, _)), CC_C(_, CC_A(), _)) => 60 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_C(_, CC_A(), _)) => 61 
  case CC_D(CC_B(_, CC_D(_, _, _)), CC_B(_, CC_E(_, _)), CC_C(_, CC_A(), _)) => 62 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_D(_, _, _)), CC_C(_, CC_A(), _)) => 63 
  case CC_D(CC_B(_, CC_E(_, _)), CC_B(_, CC_E(_, _)), CC_C(_, CC_A(), _)) => 64 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_D(_, _, _)), CC_C(_, CC_A(), _)) => 65 
  case CC_D(CC_C(_, CC_A(), CC_A()), CC_B(_, CC_E(_, _)), CC_C(_, CC_A(), _)) => 66 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_D(_, _, _)), CC_C(_, CC_A(), _)) => 67 
  case CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_E(_, _)), CC_C(_, CC_A(), _)) => 68 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_D(_, _, _)), CC_C(_, CC_A(), _)) => 69 
  case CC_D(CC_C(_, CC_A(), CC_C(_, _, _)), CC_B(_, CC_E(_, _)), CC_C(_, CC_A(), _)) => 70 
}
}
// This is not matched: CC_D(CC_C(_, CC_A(), CC_B(_, _)), CC_B(_, CC_D(_, _, _)), CC_A())