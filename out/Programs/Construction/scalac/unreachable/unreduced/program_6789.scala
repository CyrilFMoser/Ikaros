package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[(T_A[Int, (Int,Int)],T_A[Char, Boolean]), C]
case class CC_B(a: (Int,T_A[Char, Char]), b: CC_A[CC_A[Char]]) extends T_A[(T_A[Int, (Int,Int)],T_A[Char, Boolean]), CC_A[T_A[Int, Int]]]
case class CC_C[D, E](a: CC_B, b: T_A[D, E], c: CC_B) extends T_A[(T_A[Int, (Int,Int)],T_A[Char, Boolean]), D]

val v_a: T_A[(T_A[Int, (Int,Int)],T_A[Char, Boolean]), Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_B(_, CC_A(_)), _, CC_B((_,_), CC_A(_))) => 1 
}
}