package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,(Boolean,Int))], b: T_A[T_A[Byte]], c: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[Byte]], b: ((CC_A,Int),CC_A)) extends T_A[T_A[Byte]]
case class CC_C() extends T_A[T_A[Byte]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_B(CC_A(_, CC_B(_, _), _), _) => 1 
  case CC_B(CC_A(_, CC_C(), _), _) => 2 
  case CC_B(CC_B(CC_A(_, _, _), _), _) => 3 
  case CC_B(CC_B(CC_B(_, _), _), _) => 4 
  case CC_B(CC_B(CC_C(), _), _) => 5 
  case CC_B(CC_C(), _) => 6 
}
}