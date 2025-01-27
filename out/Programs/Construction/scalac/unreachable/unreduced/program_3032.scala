package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_A[Char]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_B
case class CC_C(a: T_B, b: Int) extends T_B
case class CC_D(a: Byte, b: (T_A[CC_B],T_A[CC_A])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_B(_), _) => 1 
  case CC_C(CC_C(_, _), _) => 2 
  case CC_C(CC_D(_, (_,_)), _) => 3 
  case CC_D(_, (_,_)) => 4 
}
}