package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: (T_B[(Boolean,Byte), Int],T_A[Char, (Int,Byte)]), b: T_A[T_A[Boolean, Int], T_A[Char, Byte]], c: (T_A[Boolean, Char],T_B[Int, Boolean])) extends T_A[Byte, T_A[Byte, T_B[Int, (Char,Boolean)]]]
case class CC_B(a: T_B[Int, (CC_A,Char)], b: CC_A, c: (T_A[(Byte,Int), CC_A],((Byte,Byte),CC_A))) extends T_A[Byte, T_A[Byte, T_B[Int, (Char,Boolean)]]]
case class CC_C() extends T_A[Byte, T_A[Byte, T_B[Int, (Char,Boolean)]]]
case class CC_D[E](a: T_B[E, E], b: CC_A, c: E) extends T_B[E, T_A[E, E]]
case class CC_E[F](a: Char, b: F, c: T_B[F, T_A[F, F]]) extends T_B[F, T_A[F, F]]

val v_a: T_A[Byte, T_A[Byte, T_B[Int, (Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, (_,_)), (_,(_,_))) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)