package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: (Byte,T_A)) extends T_A
case class CC_B[C]() extends T_A
case class CC_C(a: T_B[Boolean, T_A], b: (T_B[CC_A, (Int,Boolean)],T_B[Boolean, CC_A]), c: CC_A) extends T_A
case class CC_D[D](a: CC_C) extends T_B[D, CC_B[D]]
case class CC_E(a: T_A, b: T_B[T_B[CC_C, T_A], CC_B[T_B[CC_C, T_A]]]) extends T_B[CC_B[CC_B[CC_C]], CC_B[CC_B[CC_B[CC_C]]]]
case class CC_F() extends T_B[CC_B[CC_B[CC_C]], CC_B[CC_B[CC_B[CC_C]]]]

val v_a: T_B[CC_B[CC_B[CC_C]], CC_B[CC_B[CC_B[CC_C]]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, (_,_), CC_A(_, _))) => 0 
  case CC_E(CC_A(_, _), CC_D(CC_C(_, _, _))) => 1 
  case CC_E(CC_B(), CC_D(CC_C(_, _, _))) => 2 
  case CC_E(CC_C(_, _, _), CC_D(CC_C(_, _, _))) => 3 
  case CC_F() => 4 
}
}