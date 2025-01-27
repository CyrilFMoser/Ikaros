package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[Char, (Char,Int)], ((Boolean,Int),Byte)]) extends T_A[T_B[Int, Char], T_A[T_A[Byte, Char], T_A[Int, Boolean]]]
case class CC_B[E, F](a: T_A[E, F], b: T_B[CC_A, (CC_A,CC_A)], c: F) extends T_B[E, F]
case class CC_C[G](a: G) extends T_B[T_B[G, G], G]

val v_a: T_B[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, _), _) => 0 
  case CC_C(_) => 1 
}
}