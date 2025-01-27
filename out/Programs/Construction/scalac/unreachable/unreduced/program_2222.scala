package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, Char]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, Char]
case class CC_C[F](a: F, b: (T_A[Boolean, Char],(Int,Int))) extends T_A[F, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, (CC_A(),(_,_))) => 1 
  case CC_C(_, (CC_B(_),(_,_))) => 2 
  case CC_C(_, (CC_C(_, _),(_,_))) => 3 
}
}
// This is not matched: CC_B(_)