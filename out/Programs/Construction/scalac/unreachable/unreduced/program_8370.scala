package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: ((T_B,(Boolean,Byte)),T_B), b: C, c: C) extends T_A[C, (T_B,T_A[Boolean, Int])]
case class CC_B(a: Char) extends T_A[Int, (T_B,T_A[Boolean, Int])]
case class CC_C(a: Boolean, b: Char, c: T_B) extends T_B
case class CC_D(a: CC_B, b: T_A[T_B, T_A[T_B, CC_C]], c: (CC_C,CC_A[CC_C])) extends T_B

val v_a: T_A[Byte, (T_B,T_A[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),CC_C(_, _, _)), _, _) => 0 
  case CC_A(((_,_),CC_D(_, _, _)), _, _) => 1 
}
}