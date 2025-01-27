package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[(Byte,Char), Byte], T_A[T_A[(Byte,Char), Byte], T_A[(Byte,Char), Byte]]], b: CC_A[Int], c: T_A[T_A[Boolean, Char], CC_A[Int]]) extends T_A[CC_A[CC_A[Boolean]], T_A[CC_A[CC_A[Boolean]], CC_A[CC_A[Boolean]]]]
case class CC_C(a: CC_A[CC_A[CC_B]]) extends T_A[CC_A[CC_A[Boolean]], T_A[CC_A[CC_A[Boolean]], CC_A[CC_A[Boolean]]]]

val v_a: T_A[CC_A[CC_A[Boolean]], T_A[CC_A[CC_A[Boolean]], CC_A[CC_A[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 1 
  case CC_A(CC_C(_), CC_A(_, _)) => 2 
  case CC_B(_, CC_A(_, _), _) => 3 
  case CC_C(_) => 4 
}
}