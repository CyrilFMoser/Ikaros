package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (Int,Int), b: T_A[Byte, Int], c: Boolean) extends T_A[T_A[(Byte,Boolean), Byte], (Char,Char)]
case class CC_B[F, E, G](a: T_B[F, G]) extends T_B[E, F]
case class CC_C[H, I](a: CC_B[I, I, H]) extends T_B[((Int,Int),Char), H]
case class CC_D() extends T_B[((Int,Int),Char), T_B[CC_A, Byte]]

val v_a: T_A[T_A[(Byte,Boolean), Byte], (Char,Char)] = null
val v_b: Int = v_a match{
  case CC_A((12,12), _, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants