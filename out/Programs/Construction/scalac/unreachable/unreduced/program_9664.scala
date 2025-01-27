package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: T_A[T_B], b: T_A[T_B], c: T_B) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[(CC_A,CC_C)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(), CC_C(CC_A(), CC_A(), CC_C(_, _, _))) => 0 
  case CC_C(_, CC_B(), CC_C(CC_A(), CC_A(), CC_C(_, _, _))) => 1 
  case CC_C(_, CC_A(), CC_C(CC_A(), CC_A(), CC_D())) => 2 
  case CC_C(_, CC_B(), CC_C(CC_A(), CC_A(), CC_D())) => 3 
  case CC_C(_, CC_A(), CC_C(CC_A(), CC_A(), CC_E(_))) => 4 
  case CC_C(_, CC_B(), CC_C(CC_A(), CC_A(), CC_E(_))) => 5 
  case CC_C(_, CC_A(), CC_C(CC_B(), CC_A(), CC_C(_, _, _))) => 6 
  case CC_C(_, CC_B(), CC_C(CC_B(), CC_A(), CC_C(_, _, _))) => 7 
  case CC_C(_, CC_A(), CC_C(CC_B(), CC_A(), CC_D())) => 8 
  case CC_C(_, CC_B(), CC_C(CC_B(), CC_A(), CC_D())) => 9 
  case CC_C(_, CC_A(), CC_C(CC_B(), CC_A(), CC_E(_))) => 10 
  case CC_C(_, CC_B(), CC_C(CC_B(), CC_A(), CC_E(_))) => 11 
  case CC_C(_, CC_A(), CC_C(CC_A(), CC_B(), CC_C(_, _, _))) => 12 
  case CC_C(_, CC_B(), CC_C(CC_A(), CC_B(), CC_C(_, _, _))) => 13 
  case CC_C(_, CC_A(), CC_C(CC_A(), CC_B(), CC_D())) => 14 
  case CC_C(_, CC_B(), CC_C(CC_A(), CC_B(), CC_D())) => 15 
  case CC_C(_, CC_A(), CC_C(CC_A(), CC_B(), CC_E(_))) => 16 
  case CC_C(_, CC_B(), CC_C(CC_A(), CC_B(), CC_E(_))) => 17 
  case CC_C(_, CC_A(), CC_C(CC_B(), CC_B(), CC_C(_, _, _))) => 18 
  case CC_C(_, CC_B(), CC_C(CC_B(), CC_B(), CC_C(_, _, _))) => 19 
  case CC_C(_, CC_A(), CC_C(CC_B(), CC_B(), CC_D())) => 20 
  case CC_C(_, CC_B(), CC_C(CC_B(), CC_B(), CC_D())) => 21 
  case CC_C(_, CC_A(), CC_C(CC_B(), CC_B(), CC_E(_))) => 22 
  case CC_C(_, CC_B(), CC_C(CC_B(), CC_B(), CC_E(_))) => 23 
  case CC_C(_, CC_A(), CC_D()) => 24 
  case CC_C(_, CC_B(), CC_D()) => 25 
  case CC_C(_, CC_A(), CC_E(_)) => 26 
  case CC_C(_, CC_B(), CC_E(_)) => 27 
  case CC_D() => 28 
  case CC_E(_) => 29 
}
}