package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: (Int,T_A[Boolean, Int])) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], T_A[T_A[Byte, Boolean], T_A[Byte, Int]]]
case class CC_B(a: T_A[CC_A, CC_A], b: CC_A, c: Boolean) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], T_A[T_A[Byte, Boolean], T_A[Byte, Int]]]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], T_A[T_A[Byte, Boolean], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), _) => 1 
}
}