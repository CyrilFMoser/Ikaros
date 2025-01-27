package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[Byte], c: T_A[Byte]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]
case class CC_C(a: Byte, b: CC_A, c: CC_A) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, CC_B()), CC_A(_, _, _)) => 1 
  case CC_A(_, CC_A(_, _, CC_C(_, _, _)), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 3 
  case CC_A(_, CC_C(_, _, CC_A(_, _, _)), CC_A(_, _, _)) => 4 
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), CC_B()) => 5 
  case CC_A(_, CC_A(_, _, CC_B()), CC_B()) => 6 
  case CC_A(_, CC_A(_, _, CC_C(_, _, _)), CC_B()) => 7 
  case CC_A(_, CC_B(), CC_B()) => 8 
  case CC_A(_, CC_C(_, _, CC_A(_, _, _)), CC_B()) => 9 
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), CC_C(_, _, _)) => 10 
  case CC_A(_, CC_A(_, _, CC_B()), CC_C(_, _, _)) => 11 
  case CC_A(_, CC_A(_, _, CC_C(_, _, _)), CC_C(_, _, _)) => 12 
  case CC_A(_, CC_B(), CC_C(_, _, _)) => 13 
  case CC_A(_, CC_C(_, _, CC_A(_, _, _)), CC_C(_, _, _)) => 14 
  case CC_B() => 15 
  case CC_C(_, _, _) => 16 
}
}