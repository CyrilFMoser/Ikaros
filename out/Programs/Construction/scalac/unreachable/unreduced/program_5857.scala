package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D](a: T_A[D, D], b: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C(a: (T_B,Char), b: (T_B,Byte), c: T_B) extends T_B
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_A[T_B], b: CC_B[CC_A[Byte]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((CC_C(_, _, _),_), _, CC_C((_,_), (_,_), _)) => 0 
  case CC_C((CC_D(_),_), _, CC_C((_,_), (_,_), _)) => 1 
  case CC_C((CC_E(_, _),_), _, CC_C((_,_), (_,_), _)) => 2 
  case CC_C((CC_C(_, _, _),_), _, CC_D(CC_C(_, _, _))) => 3 
  case CC_C((CC_D(_),_), _, CC_D(CC_C(_, _, _))) => 4 
  case CC_C((CC_E(_, _),_), _, CC_D(CC_C(_, _, _))) => 5 
  case CC_C((CC_C(_, _, _),_), _, CC_E(CC_A(_), _)) => 6 
  case CC_C((CC_D(_),_), _, CC_E(CC_A(_), _)) => 7 
  case CC_C((CC_E(_, _),_), _, CC_E(CC_A(_), _)) => 8 
  case CC_D(_) => 9 
  case CC_E(CC_A(CC_A(_)), CC_B(_, _)) => 10 
  case CC_E(CC_A(CC_B(_, _)), CC_B(_, _)) => 11 
}
}