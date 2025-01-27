package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: (Boolean,(T_B,CC_A)), b: (T_A[(Boolean,Byte)],T_A[T_B]), c: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[CC_A]) extends T_B
case class CC_D(a: CC_A) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, (_,_), CC_A(_))) => 2 
  case CC_A(CC_B(_, (_,_), CC_B(_, _, _))) => 3 
  case CC_B((_,(_,_)), _, CC_A(CC_A(_))) => 4 
  case CC_B((_,(_,_)), _, CC_A(CC_B(_, _, _))) => 5 
  case CC_B((_,(_,_)), _, CC_B(_, _, _)) => 6 
}
}