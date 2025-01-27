package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]], b: T_B[T_B[Char]], c: T_A[Byte]) extends T_A[T_A[T_A[Char]]]
case class CC_B[C](a: C, b: CC_A, c: T_B[C]) extends T_B[C]
case class CC_C(a: T_A[CC_B[CC_A]], b: (T_B[(Boolean,Char)],T_A[CC_A]), c: (T_A[CC_A],T_B[(Int,Boolean)])) extends T_B[Boolean]
case class CC_D[D](a: CC_B[D]) extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(true, _, CC_B(_, _, _)) => 0 
  case CC_B(true, _, CC_C(_, (_,_), (_,_))) => 1 
  case CC_B(true, _, CC_D(_)) => 2 
  case CC_B(false, _, CC_B(_, _, _)) => 3 
  case CC_B(false, _, CC_C(_, (_,_), (_,_))) => 4 
  case CC_B(false, _, CC_D(_)) => 5 
  case CC_C(_, (CC_B(_, _, _),_), (_,CC_B(_, _, _))) => 6 
  case CC_C(_, (CC_B(_, _, _),_), (_,CC_D(_))) => 7 
  case CC_C(_, (CC_D(_),_), (_,CC_D(_))) => 8 
  case CC_D(CC_B(_, _, CC_B(_, _, _))) => 9 
  case CC_D(CC_B(_, _, CC_C(_, _, _))) => 10 
  case CC_D(CC_B(_, _, CC_D(_))) => 11 
}
}
// This is not matched: CC_C(_, (CC_D(_),_), (_,CC_B(_, _, _)))