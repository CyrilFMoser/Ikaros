package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (Boolean,T_A[Int])) extends T_A[Int]
case class CC_B[B](a: T_A[Int], b: T_B) extends T_A[Int]
case class CC_C(a: T_A[Byte], b: (((Boolean,Int),Char),(CC_A,CC_A)), c: Int) extends T_A[Int]
case class CC_D(a: CC_A, b: T_A[Int]) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_C(_, (_,_), 12) => 1 
  case CC_C(_, (_,_), _) => 2 
}
}
// This is not matched: CC_B(_, CC_D(_, _))