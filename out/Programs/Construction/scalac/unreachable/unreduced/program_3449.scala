package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D], c: T_B[D]) extends T_A[D, (T_B[Int],T_A[Int, Char])]
case class CC_B[E](a: E, b: E, c: Char) extends T_A[E, (T_B[Int],T_A[Int, Char])]
case class CC_C(a: Char, b: T_A[CC_B[Int], CC_B[Boolean]], c: T_A[Char, CC_B[Boolean]]) extends T_B[CC_B[CC_A[Int]]]

val v_a: T_A[Char, (T_B[Int],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}