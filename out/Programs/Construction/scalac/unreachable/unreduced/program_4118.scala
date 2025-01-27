package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((T_A,T_A),Int), b: (T_B[T_A, T_A],Char)) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: Byte) extends T_A
case class CC_D[C](a: C) extends T_B[T_B[CC_C, CC_A], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), (_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}