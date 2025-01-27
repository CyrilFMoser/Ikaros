package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: (T_B[T_A, T_A],T_A)) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A, (CC_A,CC_A)], c: T_A) extends T_A
case class CC_C[C]() extends T_B[C, T_A]
case class CC_D[D](a: Boolean, b: T_B[D, T_A], c: D) extends T_B[D, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(CC_C(), CC_A(_, _, _), _), _, CC_A(CC_C(), CC_A(_, _, _), (_,_))) => 1 
  case CC_B(CC_A(CC_C(), CC_B(_, _, _), _), _, CC_A(CC_C(), CC_A(_, _, _), (_,_))) => 2 
  case CC_B(CC_A(CC_D(_, _, _), CC_A(_, _, _), _), _, CC_A(CC_C(), CC_A(_, _, _), (_,_))) => 3 
  case CC_B(CC_A(CC_D(_, _, _), CC_B(_, _, _), _), _, CC_A(CC_C(), CC_A(_, _, _), (_,_))) => 4 
  case CC_B(CC_A(CC_C(), CC_A(_, _, _), _), _, CC_A(CC_D(_, _, _), CC_A(_, _, _), (_,_))) => 5 
  case CC_B(CC_A(CC_C(), CC_B(_, _, _), _), _, CC_A(CC_D(_, _, _), CC_A(_, _, _), (_,_))) => 6 
  case CC_B(CC_A(CC_D(_, _, _), CC_A(_, _, _), _), _, CC_A(CC_D(_, _, _), CC_A(_, _, _), (_,_))) => 7 
  case CC_B(CC_A(CC_D(_, _, _), CC_B(_, _, _), _), _, CC_A(CC_D(_, _, _), CC_A(_, _, _), (_,_))) => 8 
  case CC_B(CC_A(CC_C(), CC_A(_, _, _), _), _, CC_A(CC_C(), CC_B(_, _, _), (_,_))) => 9 
  case CC_B(CC_A(CC_C(), CC_B(_, _, _), _), _, CC_A(CC_C(), CC_B(_, _, _), (_,_))) => 10 
  case CC_B(CC_A(CC_D(_, _, _), CC_A(_, _, _), _), _, CC_A(CC_C(), CC_B(_, _, _), (_,_))) => 11 
  case CC_B(CC_A(CC_D(_, _, _), CC_B(_, _, _), _), _, CC_A(CC_C(), CC_B(_, _, _), (_,_))) => 12 
  case CC_B(CC_A(CC_C(), CC_A(_, _, _), _), _, CC_A(CC_D(_, _, _), CC_B(_, _, _), (_,_))) => 13 
  case CC_B(CC_A(CC_C(), CC_B(_, _, _), _), _, CC_A(CC_D(_, _, _), CC_B(_, _, _), (_,_))) => 14 
  case CC_B(CC_A(CC_D(_, _, _), CC_A(_, _, _), _), _, CC_A(CC_D(_, _, _), CC_B(_, _, _), (_,_))) => 15 
  case CC_B(CC_A(CC_D(_, _, _), CC_B(_, _, _), _), _, CC_A(CC_D(_, _, _), CC_B(_, _, _), (_,_))) => 16 
  case CC_B(CC_A(CC_C(), CC_A(_, _, _), _), _, CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 17 
  case CC_B(CC_A(CC_C(), CC_B(_, _, _), _), _, CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 18 
  case CC_B(CC_A(CC_D(_, _, _), CC_A(_, _, _), _), _, CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 19 
  case CC_B(CC_A(CC_D(_, _, _), CC_B(_, _, _), _), _, CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 20 
  case CC_B(CC_A(CC_C(), CC_A(_, _, _), _), _, CC_B(CC_A(_, _, _), _, CC_B(_, _, _))) => 21 
  case CC_B(CC_A(CC_D(_, _, _), CC_A(_, _, _), _), _, CC_B(CC_A(_, _, _), _, CC_B(_, _, _))) => 22 
  case CC_B(CC_A(CC_D(_, _, _), CC_B(_, _, _), _), _, CC_B(CC_A(_, _, _), _, CC_B(_, _, _))) => 23 
}
}
// This is not matched: CC_B(CC_A(CC_C(), CC_B(_, _, _), _), _, CC_B(CC_A(_, _, _), _, CC_B(_, _, _)))