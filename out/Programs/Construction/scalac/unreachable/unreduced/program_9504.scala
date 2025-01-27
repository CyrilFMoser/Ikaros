package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: (T_A[Char],T_A[Int]), c: (T_A[(Boolean,Char)],T_A[Char])) extends T_A[Char]
case class CC_B(a: T_A[Char]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),_), (_,CC_A(_, _, _))) => 0 
  case CC_A(_, (CC_A(_, _, _),_), (_,CC_B(_))) => 1 
  case CC_A(_, (CC_B(_),_), (_,CC_A(_, _, _))) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: CC_A(_, (CC_B(_),_), (_,CC_B(_)))