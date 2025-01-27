package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: (T_A[Boolean],T_A[Byte])) extends T_A[T_A[Char]]
case class CC_B(a: Byte) extends T_A[T_A[Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), (_,_)), _) => 0 
  case CC_A(CC_A(CC_B(_), (_,_)), _) => 1 
  case CC_A(CC_B(_), _) => 2 
}
}