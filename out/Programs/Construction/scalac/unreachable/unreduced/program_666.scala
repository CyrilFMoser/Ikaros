package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Char, CC_A], b: T_B[T_B[T_A, (Char,Byte)], T_A], c: CC_A) extends T_A
case class CC_C(a: Char) extends T_A
case class CC_D[C](a: (T_B[CC_A, T_A],T_B[T_A, CC_C])) extends T_B[C, CC_C]
case class CC_E(a: Char, b: (CC_A,T_B[CC_A, T_A])) extends T_B[T_B[Char, CC_C], CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}