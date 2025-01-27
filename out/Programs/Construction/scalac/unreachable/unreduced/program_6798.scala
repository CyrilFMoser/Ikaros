package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[Int], c: (T_A[Boolean],T_A[Boolean])) extends T_A[Int]
case class CC_B[B](a: T_A[Int]) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), (_,_)) => 0 
  case CC_A(_, CC_A(_, CC_B(_), _), (_,_)) => 1 
  case CC_A(_, CC_B(CC_A(_, _, _)), (_,_)) => 2 
  case CC_A(_, CC_B(CC_B(_)), (_,_)) => 3 
  case CC_B(_) => 4 
}
}