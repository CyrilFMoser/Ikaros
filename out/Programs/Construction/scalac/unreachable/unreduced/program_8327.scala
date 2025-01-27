package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: (T_A[Byte, Int],Char)) extends T_A[D, E]
case class CC_B[G, F](a: T_A[F, F], b: T_B[F], c: F) extends T_A[F, G]
case class CC_C(a: T_A[CC_B[Byte, Byte], T_A[Char, Int]], b: T_A[CC_A[(Boolean,Byte), (Byte,Boolean)], T_A[Boolean, Boolean]]) extends T_B[T_A[T_A[Int, Byte], T_A[Int, Byte]]]
case class CC_D(a: (Boolean,T_B[Byte]), b: Boolean, c: Boolean) extends T_B[T_A[T_A[Int, Byte], T_A[Int, Byte]]]
case class CC_E(a: T_A[CC_C, Boolean]) extends T_B[T_A[T_A[Int, Byte], T_A[Int, Byte]]]

val v_a: CC_A[Int, CC_E] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),_)) => 0 
  case CC_A((CC_B(_, _, _),_)) => 1 
}
}