package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[Int, E], c: T_A[E, E]) extends T_A[E, (T_A[Int, Byte],(Char,Boolean))]
case class CC_B(a: T_A[T_A[(Byte,Int), Byte], CC_A[Boolean]]) extends T_B[CC_A[Int], T_A[T_A[Boolean, Char], (Int,Boolean)]]
case class CC_C(a: CC_A[((Char,Char),Char)]) extends T_B[CC_A[Int], T_A[T_A[Boolean, Char], (Int,Boolean)]]
case class CC_D(a: Byte, b: CC_B) extends T_B[CC_A[Char], T_B[(CC_C,Int), (CC_C,CC_B)]]

val v_a: T_B[CC_A[Int], T_A[T_A[Boolean, Char], (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
}
}