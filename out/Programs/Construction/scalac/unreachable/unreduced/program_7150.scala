package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: (T_A[T_B],T_B)) extends T_A[T_B]
case class CC_B(a: T_A[CC_A], b: (T_B,T_A[T_B])) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_A, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, (CC_B(_, _),CC_A(_, _))) => 0 
  case CC_B(_, (CC_C(),CC_A(_, _))) => 1 
  case CC_B(_, (CC_D(_, _),CC_A(_, _))) => 2 
  case CC_C() => 3 
  case CC_D(CC_A(CC_C(), (_,_)), _) => 4 
  case CC_D(CC_A(CC_D(_, _), (_,_)), _) => 5 
}
}
// This is not matched: CC_D(CC_A(CC_B(_, _), (_,_)), _)