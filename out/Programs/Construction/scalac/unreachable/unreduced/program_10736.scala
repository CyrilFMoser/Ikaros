package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Char,Int)], b: (T_B[Boolean],(Int,Byte))) extends T_A[T_A[T_B[(Int,Byte)]]]
case class CC_B() extends T_A[T_A[T_B[(Int,Byte)]]]
case class CC_C(a: Boolean, b: T_A[Boolean]) extends T_A[T_A[T_B[(Int,Byte)]]]
case class CC_D[C, D](a: CC_A, b: C) extends T_B[C]
case class CC_E[E](a: E, b: T_B[E]) extends T_B[E]

val v_a: T_A[T_A[T_B[(Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, (_,_)), (CC_D(_, _),(_,_))) => 0 
  case CC_A(CC_D(_, (_,_)), (CC_E(_, _),(_,_))) => 1 
  case CC_A(CC_E((_,_), _), (CC_E(_, _),(_,_))) => 2 
  case CC_B() => 3 
  case CC_C(_, _) => 4 
}
}
// This is not matched: CC_A(CC_E((_,_), _), (CC_D(_, _),(_,_)))