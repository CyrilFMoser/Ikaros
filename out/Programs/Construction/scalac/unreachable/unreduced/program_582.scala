package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, (T_A[Boolean, Int],T_A[Int, Char])]
case class CC_B[D]() extends T_A[D, (T_A[Boolean, Int],T_A[Int, Char])]

val v_a: T_A[Char, (T_A[Boolean, Int],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}