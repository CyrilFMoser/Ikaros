package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: ((Int,Int),Char), b: Boolean, c: T_B[T_B[Char]]) extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: (T_B[CC_A],T_A[CC_A]), b: T_A[T_B[CC_A]], c: Byte) extends T_A[T_B[T_B[Byte]]]
case class CC_C(a: (T_B[Char],CC_B), b: (T_B[Char],CC_B)) extends T_B[Char]
case class CC_D(a: Char) extends T_B[Char]
case class CC_E(a: CC_A, b: (CC_D,T_B[CC_D]), c: CC_C) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_C(_, _),CC_B(_, _, _))) => 0 
  case CC_C(_, (CC_D(_),CC_B(_, _, _))) => 1 
  case CC_C(_, (CC_E(_, _, _),CC_B(_, _, _))) => 2 
  case CC_D(_) => 3 
  case CC_E(_, _, CC_C((_,_), (_,_))) => 4 
}
}