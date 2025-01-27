package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B(a: T_A[CC_A], b: T_A[(CC_A,T_B)], c: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_C() extends T_A[T_A[Byte]]
case class CC_D(a: CC_B, b: CC_B, c: T_A[T_A[Byte]]) extends T_B
case class CC_E(a: T_B, b: CC_A) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_, _, _), CC_A()) => 0 
  case CC_D(_, CC_B(_, _, _), CC_B(_, _, CC_A())) => 1 
  case CC_D(_, CC_B(_, _, _), CC_B(_, _, CC_B(_, _, _))) => 2 
  case CC_D(_, CC_B(_, _, _), CC_B(_, _, CC_C())) => 3 
  case CC_D(_, CC_B(_, _, _), CC_C()) => 4 
  case CC_E(CC_D(CC_B(_, _, _), CC_B(_, _, _), CC_A()), CC_A()) => 5 
  case CC_E(CC_D(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)), CC_A()) => 6 
  case CC_E(CC_D(CC_B(_, _, _), CC_B(_, _, _), CC_C()), CC_A()) => 7 
  case CC_E(CC_E(_, CC_A()), CC_A()) => 8 
  case CC_E(CC_F(), CC_A()) => 9 
  case CC_F() => 10 
}
}