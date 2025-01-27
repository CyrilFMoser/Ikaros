package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Int])) extends T_A[Int]
case class CC_B(a: T_A[Char]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),CC_A(_))) => 0 
  case CC_A((CC_A(_),CC_B(_))) => 1 
  case CC_A((CC_B(_),CC_A(_))) => 2 
  case CC_A((CC_B(_),CC_B(_))) => 3 
  case CC_B(_) => 4 
}
}