package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: ((Byte,Int),((Char,Char),Char)), b: T_B[Char, T_A[Byte]]) extends T_A[T_B[T_B[(Int,Byte), Int], T_A[Int]]]
case class CC_B(a: T_A[Boolean], b: T_B[T_B[Char, CC_A], Char], c: CC_A) extends T_A[T_B[T_B[(Int,Byte), Int], T_A[Int]]]
case class CC_C(a: T_B[CC_B, CC_A], b: ((CC_B,CC_B),CC_A), c: T_B[T_A[(Boolean,Byte)], CC_A]) extends T_A[T_B[T_B[(Int,Byte), Int], T_A[Int]]]
case class CC_D[D](a: CC_A, b: CC_B) extends T_B[CC_B, D]
case class CC_E[E](a: E, b: CC_A) extends T_B[CC_B, E]
case class CC_F[F](a: Boolean, b: T_B[CC_B, F]) extends T_B[CC_B, F]

val v_a: T_B[CC_B, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_, _, _)) => 0 
  case CC_E(CC_C(CC_D(_, _), (_,_), _), _) => 1 
  case CC_E(CC_C(CC_F(_, _), (_,_), _), _) => 2 
  case CC_F(_, _) => 3 
}
}
// This is not matched: CC_E(CC_C(CC_E(_, _), (_,_), _), _)