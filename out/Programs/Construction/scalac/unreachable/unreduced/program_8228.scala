package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[Boolean, T_A[Boolean, Boolean]], b: CC_A[T_A[Byte, (Boolean,Byte)]]) extends T_A[Boolean, T_A[Boolean, Boolean]]
case class CC_C(a: T_A[Boolean, T_A[Boolean, Boolean]], b: (T_A[Char, CC_B],T_A[CC_B, CC_B])) extends T_A[Boolean, T_A[Boolean, Boolean]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(), (_,_)) => 2 
  case CC_C(CC_B(CC_A(), CC_A()), (_,_)) => 3 
  case CC_C(CC_B(CC_B(_, _), CC_A()), (_,_)) => 4 
  case CC_C(CC_B(CC_C(_, _), CC_A()), (_,_)) => 5 
  case CC_C(CC_C(_, _), (_,_)) => 6 
}
}