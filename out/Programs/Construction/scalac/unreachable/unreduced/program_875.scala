package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]
case class CC_B(a: Byte) extends T_A[T_A[Byte]]
case class CC_C(a: T_A[T_A[Byte]], b: (CC_B,T_A[CC_B]), c: CC_B) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(0) => 1 
  case CC_C(CC_A(_), (_,_), _) => 2 
  case CC_C(CC_B(_), (_,_), _) => 3 
  case CC_C(CC_C(_, _, _), (_,_), _) => 4 
}
}
// This is not matched: CC_B(_)