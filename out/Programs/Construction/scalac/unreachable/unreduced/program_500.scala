package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Byte) extends T_A[E, D]
case class CC_B[G, F](a: (T_A[Boolean, Char],T_A[(Byte,Boolean), (Char,Byte)]), b: T_B[F]) extends T_A[G, F]
case class CC_C(a: CC_A[CC_B[Boolean, Char], CC_B[Boolean, Byte]], b: CC_A[T_A[(Byte,Int), Char], CC_A[Byte, Byte]], c: CC_A[(Int,Boolean), T_A[Char, Char]]) extends T_B[CC_A[CC_B[Char, (Boolean,Char)], Char]]

val v_a: T_A[T_B[CC_A[CC_B[Char, (Boolean,Char)], Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_), _) => 1 
}
}