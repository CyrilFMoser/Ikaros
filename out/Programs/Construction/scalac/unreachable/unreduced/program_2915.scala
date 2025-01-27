package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: (T_A[T_B],T_A[T_B]), c: T_B) extends T_A[T_A[T_B]]
case class CC_B() extends T_B
case class CC_C(a: T_B, b: CC_B) extends T_B
case class CC_D(a: T_A[T_A[T_B]], b: T_B, c: T_A[T_A[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _) => 1 
  case CC_C(CC_C(CC_B(), _), _) => 2 
  case CC_C(CC_C(CC_C(_, _), _), _) => 3 
  case CC_C(CC_C(CC_D(_, _, _), _), _) => 4 
  case CC_C(CC_D(_, _, CC_A(_, _, _)), _) => 5 
  case CC_D(CC_A(_, _, _), CC_B(), CC_A(_, (_,_), CC_B())) => 6 
  case CC_D(CC_A(_, _, _), CC_B(), CC_A(_, (_,_), CC_C(_, _))) => 7 
  case CC_D(CC_A(_, _, _), CC_B(), CC_A(_, (_,_), CC_D(_, _, _))) => 8 
  case CC_D(CC_A(_, _, _), CC_C(_, _), CC_A(_, (_,_), CC_B())) => 9 
  case CC_D(CC_A(_, _, _), CC_C(_, _), CC_A(_, (_,_), CC_C(_, _))) => 10 
  case CC_D(CC_A(_, _, _), CC_C(_, _), CC_A(_, (_,_), CC_D(_, _, _))) => 11 
  case CC_D(CC_A(_, _, _), CC_D(CC_A(_, _, _), CC_B(), CC_A(_, _, _)), CC_A(_, (_,_), CC_B())) => 12 
  case CC_D(CC_A(_, _, _), CC_D(CC_A(_, _, _), CC_B(), CC_A(_, _, _)), CC_A(_, (_,_), CC_C(_, _))) => 13 
  case CC_D(CC_A(_, _, _), CC_D(CC_A(_, _, _), CC_B(), CC_A(_, _, _)), CC_A(_, (_,_), CC_D(_, _, _))) => 14 
  case CC_D(CC_A(_, _, _), CC_D(CC_A(_, _, _), CC_C(_, _), CC_A(_, _, _)), CC_A(_, (_,_), CC_B())) => 15 
  case CC_D(CC_A(_, _, _), CC_D(CC_A(_, _, _), CC_C(_, _), CC_A(_, _, _)), CC_A(_, (_,_), CC_C(_, _))) => 16 
  case CC_D(CC_A(_, _, _), CC_D(CC_A(_, _, _), CC_C(_, _), CC_A(_, _, _)), CC_A(_, (_,_), CC_D(_, _, _))) => 17 
  case CC_D(CC_A(_, _, _), CC_D(CC_A(_, _, _), CC_D(_, _, _), CC_A(_, _, _)), CC_A(_, (_,_), CC_B())) => 18 
  case CC_D(CC_A(_, _, _), CC_D(CC_A(_, _, _), CC_D(_, _, _), CC_A(_, _, _)), CC_A(_, (_,_), CC_C(_, _))) => 19 
  case CC_D(CC_A(_, _, _), CC_D(CC_A(_, _, _), CC_D(_, _, _), CC_A(_, _, _)), CC_A(_, (_,_), CC_D(_, _, _))) => 20 
}
}