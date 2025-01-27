package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: Boolean) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[T_A[Boolean, Boolean], T_A[Int, Char]]]
case class CC_B(a: (T_A[CC_A, CC_A],CC_A), b: CC_A) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[T_A[Boolean, Boolean], T_A[Int, Char]]]
case class CC_C(a: T_A[(CC_B,CC_A), CC_A], b: (Int,CC_A)) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[T_A[Boolean, Boolean], T_A[Int, Char]]]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Byte, Char]], T_A[T_A[Boolean, Boolean], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}