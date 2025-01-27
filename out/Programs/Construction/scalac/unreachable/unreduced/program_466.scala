package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: (Int,T_A[Int])) extends T_A[Int]
case class CC_B(a: (T_A[CC_A],T_A[Int]), b: T_A[T_A[Int]]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B((_,_), _) => 1 
}
}