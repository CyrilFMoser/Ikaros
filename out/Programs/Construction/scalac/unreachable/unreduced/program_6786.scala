package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: (T_A[Boolean],T_A[Boolean])) extends T_A[Boolean]
case class CC_B(a: CC_A, b: CC_A, c: Int) extends T_A[Boolean]
case class CC_C[B](a: CC_B, b: (Int,CC_B), c: CC_B) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_A(_, (CC_A(_, _),CC_B(_, _, _))) => 1 
  case CC_A(_, (CC_A(_, _),CC_C(_, _, _))) => 2 
  case CC_A(_, (CC_B(_, _, _),CC_A(_, _))) => 3 
  case CC_A(_, (CC_B(_, _, _),CC_B(_, _, _))) => 4 
  case CC_A(_, (CC_B(_, _, _),CC_C(_, _, _))) => 5 
  case CC_A(_, (CC_C(_, _, _),CC_A(_, _))) => 6 
  case CC_A(_, (CC_C(_, _, _),CC_B(_, _, _))) => 7 
  case CC_A(_, (CC_C(_, _, _),CC_C(_, _, _))) => 8 
  case CC_B(CC_A(_, (_,_)), CC_A(_, (_,_)), _) => 9 
  case CC_C(_, _, _) => 10 
}
}