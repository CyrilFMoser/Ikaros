package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char, b: (T_A[Int, Int],T_A[Boolean, Char])) extends T_A[Int, Int]
case class CC_B(a: CC_A) extends T_A[Int, Int]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A('x', (CC_A(_, _),_)) => 0 
  case CC_A(_, (CC_A(_, _),_)) => 1 
  case CC_A('x', (CC_B(_),_)) => 2 
  case CC_A(_, (CC_B(_),_)) => 3 
  case CC_B(_) => 4 
}
}