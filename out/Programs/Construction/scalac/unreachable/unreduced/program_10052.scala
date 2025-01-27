package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Int],T_A[Boolean]), b: T_A[Int], c: T_A[(Char,Char)]) extends T_A[Int]
case class CC_B() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),_), CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A((CC_A(_, _, _),_), CC_A(_, CC_B(), _), _) => 1 
  case CC_A((CC_A(_, _, _),_), CC_B(), _) => 2 
  case CC_A((CC_B(),_), CC_A(_, CC_A(_, _, _), _), _) => 3 
  case CC_A((CC_B(),_), CC_A(_, CC_B(), _), _) => 4 
  case CC_A((CC_B(),_), CC_B(), _) => 5 
  case CC_B() => 6 
}
}