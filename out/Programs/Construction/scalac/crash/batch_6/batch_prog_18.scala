package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[C], b: T_A[C], c: (Int,Char)) extends T_A[C]
case class CC_C[D](a: T_A[D]) extends T_A[D]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_C(CC_B(CC_A(), CC_A(), (_,_))) => 1 
  case CC_C(CC_B(CC_B(_, _, _), CC_A(), (_,_))) => 2 
  case CC_C(CC_B(CC_C(_), CC_A(), (_,_))) => 3 
  case CC_C(CC_B(CC_A(), CC_B(_, _, _), (_,_))) => 4 
  case CC_C(CC_B(CC_B(_, _, _), CC_B(_, _, _), (_,_))) => 5 
  case CC_C(CC_B(CC_C(_), CC_B(_, _, _), (_,_))) => 6 
  case CC_C(CC_B(CC_A(), CC_C(_), (_,_))) => 7 
  case CC_C(CC_B(CC_B(_, _, _), CC_C(_), (_,_))) => 8 
  case CC_C(CC_B(CC_C(_), CC_C(_), (_,_))) => 9 
  case CC_C(CC_C(CC_A())) => 10 
  case CC_C(CC_C(CC_B(_, _, _))) => 11 
  case CC_C(CC_C(CC_C(_))) => 12 
}
}