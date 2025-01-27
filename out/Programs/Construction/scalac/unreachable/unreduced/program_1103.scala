package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean) extends T_A[T_B[T_B[(Boolean,Int)]], D]
case class CC_B[E](a: CC_A[E], b: ((Char,Byte),T_A[Int, Char]), c: T_B[E]) extends T_A[T_B[T_B[(Boolean,Int)]], E]
case class CC_C[F](a: F, b: ((Char,(Int,Int)),T_A[(Byte,Char), Byte])) extends T_A[T_B[T_B[(Boolean,Int)]], F]
case class CC_D(a: Byte, b: CC_C[CC_B[Char]]) extends T_B[CC_B[Byte]]

val v_a: T_A[T_B[T_B[(Boolean,Int)]], T_B[CC_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), (_,_), _) => 1 
}
}
// This is not matched: CC_C(CC_D(_, _), _)