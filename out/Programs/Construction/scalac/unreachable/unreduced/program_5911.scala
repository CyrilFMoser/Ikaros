package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(T_A[Byte, Boolean],T_A[Char, Boolean]), T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]]]
case class CC_B(a: CC_A, b: CC_A, c: Boolean) extends T_A[(T_A[Byte, Boolean],T_A[Char, Boolean]), T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]]]
case class CC_C(a: T_A[T_A[Int, CC_A], CC_A], b: T_A[CC_A, CC_A]) extends T_A[(T_A[Byte, Boolean],T_A[Char, Boolean]), T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]]]

val v_a: T_A[(T_A[Byte, Boolean],T_A[Char, Boolean]), T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_C(_, _) => 2 
}
}