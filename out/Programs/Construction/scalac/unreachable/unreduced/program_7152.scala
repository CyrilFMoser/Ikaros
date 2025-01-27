package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, Byte]
case class CC_B[D](a: (Byte,T_A[Boolean, (Int,Boolean)])) extends T_A[D, Byte]
case class CC_C[E](a: T_A[E, Byte], b: CC_B[E], c: T_A[E, Byte]) extends T_A[E, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_)) => 1 
  case CC_C(CC_A(_), CC_B((_,_)), _) => 2 
  case CC_C(CC_B((_,_)), CC_B((_,_)), _) => 3 
  case CC_C(CC_C(_, CC_B(_), CC_A(_)), CC_B((_,_)), _) => 4 
  case CC_C(CC_C(_, CC_B(_), CC_B(_)), CC_B((_,_)), _) => 5 
  case CC_C(CC_C(_, CC_B(_), CC_C(_, _, _)), CC_B((_,_)), _) => 6 
}
}