package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,(Boolean,T_A)), b: T_B[Boolean, Int]) extends T_A
case class CC_B(a: (T_B[Byte, T_A],Char), b: T_B[T_A, Boolean]) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[C](a: CC_A, b: C, c: Boolean) extends T_B[Boolean, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _),(_,_)), CC_D(_, _, _)) => 0 
  case CC_A((CC_B(_, _),(_,_)), CC_D(_, _, _)) => 1 
  case CC_A((CC_C(_),(_,_)), CC_D(_, _, _)) => 2 
  case CC_B(_, _) => 3 
  case CC_C(CC_A((_,_), CC_D(_, _, _))) => 4 
}
}