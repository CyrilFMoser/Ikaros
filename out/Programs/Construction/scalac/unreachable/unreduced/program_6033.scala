package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int, b: T_B[D]) extends T_A[Char, D]
case class CC_B(a: (T_B[Char],CC_A[(Byte,Char)]), b: T_B[CC_A[Boolean]], c: Char) extends T_B[Char]
case class CC_C(a: Boolean) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_, _, _),CC_A(_, _)), _, _) => 0 
  case CC_B((CC_C(_),CC_A(_, _)), _, _) => 1 
  case CC_C(_) => 2 
}
}