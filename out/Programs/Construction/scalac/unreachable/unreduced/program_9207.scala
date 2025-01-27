package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: Char, c: T_A[T_A[Int]]) extends T_A[(T_A[Int],(Boolean,Int))]
case class CC_B() extends T_A[(T_A[Int],(Boolean,Int))]

val v_a: T_A[(T_A[Int],(Boolean,Int))] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}