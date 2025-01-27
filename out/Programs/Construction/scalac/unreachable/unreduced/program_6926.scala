package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],T_A[(Char,Boolean)]), b: T_A[T_A[Boolean]], c: T_A[T_A[(Int,Int)]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[Char]], b: (CC_A,T_A[CC_A])) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(CC_A(_, _, _), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
}
}