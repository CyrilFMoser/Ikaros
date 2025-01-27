package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_A[T_B, T_B], T_B], C]
case class CC_B[D](a: D) extends T_A[T_A[T_A[T_B, T_B], T_B], D]
case class CC_C(a: T_A[CC_A[T_B], T_B], b: T_A[T_A[T_B, T_B], CC_A[T_B]], c: Int) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_B, b: CC_A[Boolean], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
  case CC_E(CC_C(_, _, _), _, CC_C(_, _, _)) => 2 
  case CC_E(CC_C(_, _, _), _, CC_D()) => 3 
  case CC_E(CC_C(_, _, _), _, CC_E(CC_C(_, _, _), CC_A(), CC_C(_, _, _))) => 4 
  case CC_E(CC_C(_, _, _), _, CC_E(CC_C(_, _, _), CC_A(), CC_D())) => 5 
  case CC_E(CC_C(_, _, _), _, CC_E(CC_C(_, _, _), CC_A(), CC_E(_, _, _))) => 6 
  case CC_E(CC_C(_, _, _), _, CC_E(CC_D(), CC_A(), CC_C(_, _, _))) => 7 
  case CC_E(CC_C(_, _, _), _, CC_E(CC_D(), CC_A(), CC_D())) => 8 
  case CC_E(CC_C(_, _, _), _, CC_E(CC_D(), CC_A(), CC_E(_, _, _))) => 9 
  case CC_E(CC_C(_, _, _), _, CC_E(CC_E(_, _, _), CC_A(), CC_C(_, _, _))) => 10 
  case CC_E(CC_C(_, _, _), _, CC_E(CC_E(_, _, _), CC_A(), CC_D())) => 11 
  case CC_E(CC_C(_, _, _), _, CC_E(CC_E(_, _, _), CC_A(), CC_E(_, _, _))) => 12 
  case CC_E(CC_D(), _, CC_C(_, _, _)) => 13 
  case CC_E(CC_D(), _, CC_D()) => 14 
  case CC_E(CC_D(), _, CC_E(CC_C(_, _, _), CC_A(), CC_C(_, _, _))) => 15 
  case CC_E(CC_D(), _, CC_E(CC_C(_, _, _), CC_A(), CC_D())) => 16 
  case CC_E(CC_D(), _, CC_E(CC_C(_, _, _), CC_A(), CC_E(_, _, _))) => 17 
  case CC_E(CC_D(), _, CC_E(CC_D(), CC_A(), CC_C(_, _, _))) => 18 
  case CC_E(CC_D(), _, CC_E(CC_D(), CC_A(), CC_D())) => 19 
  case CC_E(CC_D(), _, CC_E(CC_D(), CC_A(), CC_E(_, _, _))) => 20 
  case CC_E(CC_D(), _, CC_E(CC_E(_, _, _), CC_A(), CC_C(_, _, _))) => 21 
  case CC_E(CC_D(), _, CC_E(CC_E(_, _, _), CC_A(), CC_D())) => 22 
  case CC_E(CC_D(), _, CC_E(CC_E(_, _, _), CC_A(), CC_E(_, _, _))) => 23 
  case CC_E(CC_E(_, _, _), _, CC_C(_, _, _)) => 24 
  case CC_E(CC_E(_, _, _), _, CC_D()) => 25 
  case CC_E(CC_E(_, _, _), _, CC_E(CC_C(_, _, _), CC_A(), CC_C(_, _, _))) => 26 
  case CC_E(CC_E(_, _, _), _, CC_E(CC_C(_, _, _), CC_A(), CC_D())) => 27 
  case CC_E(CC_E(_, _, _), _, CC_E(CC_C(_, _, _), CC_A(), CC_E(_, _, _))) => 28 
  case CC_E(CC_E(_, _, _), _, CC_E(CC_D(), CC_A(), CC_C(_, _, _))) => 29 
  case CC_E(CC_E(_, _, _), _, CC_E(CC_D(), CC_A(), CC_D())) => 30 
  case CC_E(CC_E(_, _, _), _, CC_E(CC_D(), CC_A(), CC_E(_, _, _))) => 31 
  case CC_E(CC_E(_, _, _), _, CC_E(CC_E(_, _, _), CC_A(), CC_C(_, _, _))) => 32 
  case CC_E(CC_E(_, _, _), _, CC_E(CC_E(_, _, _), CC_A(), CC_D())) => 33 
  case CC_E(CC_E(_, _, _), _, CC_E(CC_E(_, _, _), CC_A(), CC_E(_, _, _))) => 34 
}
}