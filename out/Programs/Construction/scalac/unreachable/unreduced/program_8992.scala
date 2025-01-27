package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[((Byte,Byte),T_A[Boolean, Byte]), E]
case class CC_B(a: Char, b: T_B[Int, T_B[Boolean, (Boolean,Char)]], c: CC_A[Boolean]) extends T_A[((Byte,Byte),T_A[Boolean, Byte]), T_A[CC_A[Byte], (Char,Boolean)]]
case class CC_C[F](a: CC_A[F], b: Int, c: CC_B) extends T_B[CC_B, F]
case class CC_D[G](a: CC_B, b: T_B[G, G]) extends T_B[CC_B, G]
case class CC_E(a: (Byte,(CC_B,CC_B))) extends T_B[CC_B, Int]

val v_a: T_B[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _, CC_B(_, _, _)) => 0 
  case CC_E((_,(_,_))) => 1 
}
}
// This is not matched: CC_D(_, _)