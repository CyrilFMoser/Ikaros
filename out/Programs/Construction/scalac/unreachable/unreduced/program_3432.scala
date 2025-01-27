package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[(T_A[Boolean, Char],T_A[Int, Char]), C]
case class CC_B(a: T_A[T_A[Char, Char], T_A[Byte, Int]], b: T_A[CC_A[Boolean, Int], Char], c: T_A[CC_A[Byte, Int], CC_A[Boolean, Byte]]) extends T_A[(T_A[Boolean, Char],T_A[Int, Char]), T_A[CC_A[Boolean, Char], (Char,Boolean)]]

val v_a: T_A[(T_A[Boolean, Char],T_A[Int, Char]), T_A[CC_A[Boolean, Char], (Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}